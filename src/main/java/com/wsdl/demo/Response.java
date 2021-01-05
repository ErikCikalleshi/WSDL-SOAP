package com.wsdl.demo;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"result"})
@XmlRootElement(name = "Response")
public class Response {

    @XmlElement(required = true)
    protected String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


}

