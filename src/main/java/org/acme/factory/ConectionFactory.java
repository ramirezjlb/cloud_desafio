// package org.acme.factory;

// import javax.enterprise.context.Dependent;
// import javax.enterprise.inject.Produces;

// import io.r2dbc.h2.CloseableConnectionFactory;
// import io.r2dbc.h2.H2Connection;
// import io.r2dbc.h2.H2ConnectionFactory;
// import reactor.core.publisher.Mono;

// @Dependent
// public class ConectionFactory {
//     @Produces
//     CloseableConnectionFactory cf = H2ConnectionFactory.inMemory("testdb");
//     Mono<H2Connection> conn =  cf.create();
// }
