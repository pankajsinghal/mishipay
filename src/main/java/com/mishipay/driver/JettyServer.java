package com.mishipay.driver;


import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class JettyServer {

    private static final Logger logger = LoggerFactory.getLogger(JettyServer.class);

    public static void main(String[] args) {
        new JettyServer().start(8080);
    }

    public void start(int port) {
        Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(port);
        server.setConnectors(new Connector[] { connector });
        WebAppContext context = new WebAppContext();
        context.setServer(server);
        context.setContextPath("/");
        context.setResourceBase("src/main/webapp");
        context.setDescriptor(context.getResourceBase() + File.separator + "WEB-INF" + File.separator + "web.xml");

        logger.error(" context.getResourceBase : " + context.getResourceBase());
        logger.error(" context.getDescriptor : " + context.getDescriptor());
        server.setHandler(context);
        while (true) {
            try {
                server.start();
                logger.error("t.server started");
                break;
            } catch (Exception e) {
                logger.error("exception while starting t.server", e);
            }
        }


        try {
            logger.error("joining t.server");
            server.join();
        } catch (InterruptedException e) {
            logger.error("exception while joining t.server", e);
        }
    }
}