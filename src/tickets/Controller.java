package tickets;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private final int maxTickts = 15;
    private int ticketNum = 1;
    private Queue ticketsQueue = new Queue(maxTickts);

    @FXML
    private TextField ticketsNumber;

    @FXML
    private TextField currentTicket;

    @FXML
    private Button pullTicket;

    @FXML
    private Button newTicket;


    @FXML
    void ticketAction(ActionEvent event) {
        if (event.getSource() == pullTicket) {
            //Enqueue Tickets
            ticketsQueue.Enqueue(ticketNum);
            ticketsNumber.setText(Integer.toString(ticketNum));
            if (!ticketsQueue.isFull())
                ticketNum++;
        } else if (event.getSource() == newTicket) {
            //Dequeue Tickets
            try {
                int cTicket = (Integer) ticketsQueue.Dequeue();
                currentTicket.setText(Integer.toString(cTicket));
            } catch (NullPointerException e) {
                currentTicket.setText("0");
            }

        }
    }


}
