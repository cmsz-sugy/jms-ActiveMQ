package com.spring.jms.com_jms;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class jmsApplication extends Application<jmsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new jmsApplication().run(args);
    }

    @Override
    public String getName() {
        return "jms";
    }

    @Override
    public void initialize(final Bootstrap<jmsConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final jmsConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
