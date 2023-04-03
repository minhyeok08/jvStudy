import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;
public class 선택조건문_4 {
//pTe9aJHEF_o
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{	Scanner scan = new Scanner(System.in);
			System.out.println("검색어 입력");
			String fd = scan.next();
			
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("a.title");
			Elements singer = doc.select("a.title");
			for(int i=0; i<title.size();i++)
			{
				String s = title.get(i).text();
				if(s.contains(fd))
				{
					System.out.println(title.get(i).text()+" "+singer.get(i).text());
				}
			}
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
					+"http://youtube.com/embed/F0B7HDiY-10");
		}catch(Exception ex) {}
	}

}
