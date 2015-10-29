
package udp_printf;

import java.net.* ;

/**
 *  A simple datagram client
 *  Shows how to send broadcast udp message in Java
 *
 */
public class DatagramClient
{
	public static String host="192.168.31.255";
	public static int port = 9999;

	public static void uprintf(String data)
	{
			send_udp_print(data);
	}
	public static void send_udp_print(String data)
	{
		byte[] sendData = data.getBytes();
		try
		{
			DatagramSocket socket = new DatagramSocket();
			socket.setBroadcast(true);
			DatagramPacket packet = new DatagramPacket(new byte[0], 0, InetAddress.getByName(host),port);
			packet.setData(sendData);
			socket.send( packet );
			socket.close();

		}catch (Exception e)
		{
			
		}
	}
}

