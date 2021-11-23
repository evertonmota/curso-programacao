package curso_programacao_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FormataDatas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat gmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		gmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date data = new Date();
		Date data2 = new Date(System.currentTimeMillis());
		Date data3 = new Date(0L);
		Date data4 = new Date(1000L * 60L * 60L * 5L);
		
		Date d1 = sdf1.parse("25/05/2020");
		Date d2 = sdf2.parse("25/05/2020 18:30:50");
		
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);

		System.out.println(sdf2.format(d1));
		System.out.println(sdf2.format(d2));
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println(gmt.format(d1));
		System.out.println(gmt.format(d2));
		System.out.println(gmt.format(data3));
		System.out.println(gmt.format(data4));

	}

}
