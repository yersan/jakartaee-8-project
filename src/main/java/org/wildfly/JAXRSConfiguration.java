package org.wildfly;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class JAXRSConfiguration extends Application {}