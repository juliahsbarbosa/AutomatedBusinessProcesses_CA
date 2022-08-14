package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class ServiceDiscovery {

	private static class Listener implements ServiceListener {

		public void serviceAdded(ServiceEvent event) {
			// TODO Auto-generated method stub
			System.out.println("\nService Added " + event.getInfo());
		}

		public void serviceRemoved(ServiceEvent event) {
			// TODO Auto-generated method stub
			System.out.println("Service Removed " + event.getInfo());
		}

		public void serviceResolved(ServiceEvent event) {
			// TODO Auto-generated method stub
			System.out.println("Service Resolved " + event.getInfo());

		}
	}

	public static ServiceInfo run(String serviceType) {

		ServiceInfo sInfo = null;
		// get an instance of jmDNS

		try {
			// Create jmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Add service listener
			jmdns.addServiceListener(serviceType, new Listener());

			// Sleep for 2 seconds
			Thread.sleep(2000);

			jmdns.close();

			// Error handling
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sInfo;
	}

}
