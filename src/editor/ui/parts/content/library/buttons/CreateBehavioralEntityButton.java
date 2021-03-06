package editor.ui.parts.content.library.buttons;

import editor.ui.parts.content.library.buttons.parts.CustomButton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class CreateBehavioralEntityButton extends CustomButton {
    public CreateBehavioralEntityButton() {
        try {
            Image rotateToolImage = ImageIO.read(new File("assets/entity.png"))
                    .getScaledInstance(16, 16, Image.SCALE_SMOOTH);
            setIcon(new ImageIcon(rotateToolImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setToolTipText("Create Behavioral Entity");

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
