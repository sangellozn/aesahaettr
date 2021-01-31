package aesahaettr.xml;

import java.time.Instant;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class InstantAdapter extends XmlAdapter<String, Instant> {

    @Override
    public Instant unmarshal(String v) throws Exception {
        return Instant.ofEpochSecond(Long.valueOf(v));
    }

    @Override
    public String marshal(Instant v) throws Exception {
        return String.valueOf(v.getEpochSecond());
    }

}
