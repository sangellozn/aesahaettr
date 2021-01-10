package aesahaettr;

import java.io.File;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import aesahaettr.xml.bean.Aesahaettr;

public final class AesahaettrXmlInstance {

    private static Aesahaettr INSTANCE;

    private AesahaettrXmlInstance() {
        // Nothing.
    }

    private static Aesahaettr load() {
        try {
            InitialContext context = new InitialContext();
            Context xmlNode = (Context) context.lookup("java:comp/env");
            String dataFilePath = (String) xmlNode.lookup("data-file");

            JAXBContext jaxbContext = JAXBContext.newInstance(Aesahaettr.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (Aesahaettr) jaxbUnmarshaller.unmarshal(new File(dataFilePath));
        } catch (NamingException | JAXBException e) {
            throw new RuntimeException(e);
        }

    }

    public static synchronized void save() {
        try {
            InitialContext context = new InitialContext();
            Context xmlNode = (Context) context.lookup("java:comp/env");
            String dataFilePath = (String) xmlNode.lookup("data-file");

            JAXBContext jaxbContext = JAXBContext.newInstance(Aesahaettr.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.marshal(AesahaettrXmlInstance.INSTANCE, new File(dataFilePath));
        } catch (NamingException | JAXBException e) {
            throw new RuntimeException(e);
        }

    }

    public static synchronized Aesahaettr getInstance() {
        if (AesahaettrXmlInstance.INSTANCE == null) {
            AesahaettrXmlInstance.INSTANCE = AesahaettrXmlInstance.load();
        }

        return AesahaettrXmlInstance.INSTANCE;
    }

}
