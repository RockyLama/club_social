package model;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class SerializadorClubSocial {
    
    private static String filepath = "clubSocial.xml";
    
    public static void grabarClub_social(Club_social aGrabar) throws FileNotFoundException{
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filepath)));
        encoder.writeObject(aGrabar);
        encoder.close();
    }
    
    public static Club_social cargarClub_social() throws FileNotFoundException {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filepath)));
        Club_social ans = (Club_social) decoder.readObject();
        decoder.close();
        return ans;
    }
}
