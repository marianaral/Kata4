package kata4.main;

import kata4.view.MailHistogramReader;
import kata4.view.MailHistogramBuilder;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;


public class Kata4 {

    
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailHistogramReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", histogram);
        histogramDisplay.execute();
    }
    
}
