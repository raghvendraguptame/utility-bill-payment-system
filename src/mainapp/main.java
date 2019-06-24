package mainapp;
import UIComponents.MainLogin;
import UIComponents.MainPage;
import database.*;
import java.util.*;
import bill.*;

public class main
{

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });

    }

}