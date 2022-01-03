package com.sist.manager;

import com.sist.dao.Books;
import com.sist.dao.BooksDAO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class BooksManager {
    // ����Ŭ�� ���� => BooksDAO
    private BooksDAO dao = new BooksDAO(); // �����͸� ����Ŭ�� �߰�

    public void booksGetData() {
        // try~catch (���ܺ���), throws(����ȸ�� => ����)
        // ������ �����߻��� �����ϴ� ���α׷� => ������ ����ִ� ���� �ƴϰ�
        // ������ �κ��� �����ؼ� => ������������ �̵�
        // ������ �κ��� Ȯ�� => getMessage(), printStackTrace()
        try {
            // ���� �б� => ����
            StringBuffer sb = new StringBuffer();
            FileInputStream fis = new FileInputStream("c:\\Heejun\\books.txt");
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8));
            // ���� ��ü�� �о => �ӽ�����
            while (true) {
                String data = br.readLine();
                if (data == null) break;
                sb.append(data);
            }
//            System.out.println(sb.toString()); // �޸𸮿� ����� �����͸� ���
            // <> => �±� �� ������ ����
            // <div id="a"> => div#a  => div:eq(0)
            // <div class="b"> => div.b => div:eq(1)
            // <div> => HTML
            // Jsoup => HTML parser => �ʿ��� �����͸� ã���ִ� ����
            Document doc = Jsoup.parse(sb.toString());
            /*
             *       connect() => ���� URL�� �̿��ؼ� �������� ����
             *       parse() => HTML���ڿ�, ����
             */
            Elements title = doc.select("h4.main-title");
            Elements poster = doc.select("div.book-list-image img");
            Elements content = doc.select("div.sub-title");
            Elements author = doc.select("div.book-info span.author");
            Elements price = doc.select("div.book-info");
            Elements regdate = doc.select("div.book-info span.pub-date");
            Elements isbn = doc.select("div.book-info span.isbn");
            Elements tags = doc.select("div.book-info span.tag");
            /*
            *       <div>��</div> ==> text()
            *       <img src ="��"> ==> attr("src")
            * */
            for (int i = 0; i < title.size(); i++) {
                String title_data = title.get(i).text();
                String poster_data = poster.get(i).attr("src");
                String author_data = author.get(i).text();
                String regdate_data = regdate.get(i).text().replace("|","");
                String isbn_data = isbn.get(i).text();
                String tags_data = tags.get(i).text();

                String cd =""; // sub-title�� ���� �����͸� ""���� ����
                try {
                    String content_data = content.get(i).text();
                    cd = content_data;
                }catch (Exception e){}

                String price_data = price.get(i).text();
                String p = "";
                StringTokenizer st = new StringTokenizer(price_data,"|");
                int count = st.countTokens();
                if(count==4){
                    String[] ss = price_data.split("\\|");
                    p=ss[1];
                }else{
                    String[] ss = price_data.split("\\|");
                    p=ss[2];
                }
                String au = author_data.substring(0,author_data.lastIndexOf("��")).trim();
                String is = isbn_data.substring(isbn_data.indexOf(":")+1).trim();

                System.out.println("��ȣ : " + (i+1));
                System.out.println("���� : " + title_data);
                System.out.println("���� : " + au);
                System.out.println("�׸� : " + poster_data);
                System.out.println("�Ұ� : " + cd);
                System.out.println("���� : " + p);
                System.out.println("����� : " + regdate_data);
                System.out.println("ISBN : " + isbn_data);
                System.out.println("�±� : " + tags_data);

                // ����Ŭ�� ������ ÷��
                Books book = new Books();
                book.setNo(i+1);
                book.setTitle(title_data);
                book.setPoster(poster_data);
                book.setContent(cd);
                book.setAuthor(au);
                book.setPrice(p);
                book.setRegdate(regdate_data);
                book.setIsbn(isbn_data);
                book.setTags(tags_data);

                dao.dbInsert(book);

                // ���� �ӵ� != ����Ŭ ����
                Thread.sleep(300);
            }
            System.out.println("********* ����Ŭ ���� �Ϸ�!! *********");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BooksManager bm = new BooksManager();
        bm.booksGetData();
    }
}
