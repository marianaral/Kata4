package kata4.main;

import kata4.view.MailHistogramReader;
import kata4.view.MailHistogramBuilder;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;


public class Kata4 {

    
    public static void main(String[] args) {
        execute();
        
    }
    
        public static void execute(){
            List<Mail> mailList = input();
            Histogram histogram = process(mailList);
            output(histogram);
        }

        public static List<Mail> input(){
            String fileName = new String("email.txt");
            List<Mail> mailList = MailHistogramReader.read(fileName);
            return mailList;
        }

        public static Histogram process(List<Mail> mailList){
            Histogram<String> histogram = MailHistogramBuilder.build(mailList);
            return histogram;
        }

        public static void output(Histogram histogram){
            HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", histogram);//o
            histogramDisplay.execute();
        }
    
    
    
}
