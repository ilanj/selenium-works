package reports;
//jfreechart or xchart
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
/**
 * @author imssbora
 */
public class PieChart extends JFrame {
    private static final long serialVersionUID = 6294689542092367723L;

    public PieChart(String title) throws IOException {
        super(title);

        // Create dataset
        PieDataset dataset = createDataset();

        // Create chart
        JFreeChart chart = ChartFactory.createPieChart(
                "Pie Chart Example",
                dataset,
                true,
                true,
                false);

        //Format Label
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
                "Marks {0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);

        // Create Panel
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
        File lineChart = new File("./gggg.jpg");

        ChartUtilities.saveChartAsPNG(lineChart ,chart, 800 ,400);
    }

    private PieDataset createDataset() {

        DefaultPieDataset dataset=new DefaultPieDataset();
        dataset.setValue("80-100", 120);
        dataset.setValue("60-79", 80);
        dataset.setValue("40-59", 20);
        dataset.setValue("20-39", 7);
        dataset.setValue("0-19", 3);
        return dataset;
    }

    public static void main(String[] args) throws IOException {

            PieChart example = new PieChart("Pie Chart Example ");
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);

    }
}