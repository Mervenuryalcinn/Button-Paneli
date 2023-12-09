import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class button_odevi extends JButton {
    //degiskenler tanimlandi
    private String graphQLSchema;
    private Color aktifRenk;
    private Color pasifRenk;
    private boolean aktif;

    public button_odevi (String text) {
        //degiskenlere atamalar yapildi.
        super(text);
        this.graphQLSchema = "";
        this.aktifRenk= Color.pink;
        this.pasifRenk = Color.yellow;
        this.aktif = false;

        setPasifDurum();
        addActionListener(new ButtonTiklama());
    }

    public void setGraphQLSchema(String şema) {
        this.graphQLSchema = şema;
    }

    //aktif olursa hangi renk olacagı belirlendi
    public void setAktifRenk(Color renk) {
        this.aktifRenk = renk;
    }
    //pasif olursa hangi renk olacagı belirlendi
    public void setPasifRenk(Color renk) {
        this.pasifRenk = renk;
    }
    //pasif olduğunda renk ve yazı değisecek
    private void setPasifDurum() {
        setBackground(pasifRenk);
        setText("Pasif");
        aktif= false;
    }
    //aktif olduğunda renk ve yazi degisecek
    private void setAktifDurum() {
        setBackground(aktifRenk);
        setText("Aktif");
        aktif = true;
    }

    private class ButtonTiklama implements ActionListener {
        //butona tıklandıgında olabilecekler belirlendi
        @Override
        public void actionPerformed(ActionEvent e) {
            if (aktif) {
                setPasifDurumForAllButtonsExceptCurrent();
                aktif = false; // Butonu pasif hale getirr
            } else {
                setAktifDurum();
                aktif = true; // Butonu aktif hale getirir
                //tiklandigi zaman aktif oldugunda çalışıyor yazacak.
                System.out.println("Çalışıyor: " + graphQLSchema);
            }
        }
    }

    private void setPasifDurumForAllButtonsExceptCurrent() {
        for (Component component : getParent().getComponents()) {
            if (component instanceof button_odevi ) {
                button_odevi  button = (button_odevi ) component;
                if (button != this) {
                    button.setPasifDurum();
                }
            }
        }
    }

    public static void main(String[] args) {
        //kutucuklar oluşturuldu
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button Kontrol Paneli Uygulaması.");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(4, 4, 10, 10));

            button_odevi [] buttons = new button_odevi [16];
            //for döngüsü ile tiklanan kutuya link atama yapildi
            for (int i = 0; i < 16; i++) {
                buttons[i] = new button_odevi ("Button " + (i + 1));
                frame.add(buttons[i]);
                buttons[i].setGraphQLSchema("https://api.example.com/graphql");
            }

            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}