package com.water_vehicle_tracker.herokuapp.water_vehicle_tracker.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws/echo")
public class Echo {
	private Session session;
	
	@OnOpen
	public void connect(Session session) {
		this.session =session;
		System.out.println("session connect");

	}
	
	@OnClose
	public void close() {
		this.session =null;
		System.out.println("session closed");

	}
	
	@OnMessage
	public void onMessage(String msg) {
		System.out.println("session on message");
		this.session.getAsyncRemote().sendText("Echo: "+msg);

	}

}