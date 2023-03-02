package net.youssfi.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.youssfi.grpc.service.BankGrpcServiceImpl;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(9090)
                .addService(new BankGrpcServiceImpl())
                .build();
        server.start();
        System.out.println("Grpc Server started in port : 9090");
        server.awaitTermination();
    }
}
