package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class ServiceRegistration {

	public void run(int port, String serviceType, String serviceName) {

		try {
			// Create a JmDNS object instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			int servicePort = port;
			String serviceDes = "jmDNS with gRPC";

			// Register a service
			ServiceInfo serviceInfo = ServiceInfo.create(serviceType, serviceName, servicePort, serviceDes);
			jmdns.registerService(serviceInfo);

			System.out.printf("Service type: " + serviceType + "\nName: " + serviceName
					+ "\nOn port: " + servicePort);

			Thread.sleep(1000);
			System.out.println("\nService Registered successufully!");

			// Handle exceptions
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
