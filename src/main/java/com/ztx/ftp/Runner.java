package com.ztx.ftp;

import com.enterprisedt.net.ftp.FTPClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        FTPClient ftp = new FTPClient();

        System.out.println("hello word");
    }
}
