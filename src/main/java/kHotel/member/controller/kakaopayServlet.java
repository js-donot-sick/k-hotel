package kHotel.member.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/jq")
public class kakaopayServlet extends HttpServlet{

	public String kakaopay() {
		
		try {
			URL address = new URL("https://kapi.kakao.com/v1/payment/ready");
			HttpURLConnection serverConnect = (HttpURLConnection)address.openConnection();
			serverConnect.setRequestMethod("POST");
			serverConnect.setRequestProperty("Authorization", "KakaoAK 3ed4943d68d6f4d0ec7b747fec295c9d");
			serverConnect.setRequestProperty("content-type", "Content-type: application/x-www-form-urlencoded;charset=utf-8");
			serverConnect.setDoOutput(true);
			String parameter = "cid=TC0ONETIME&partner_order_id=partner_order_id&partner_user_id=partner_user_id&item_name=engitem&quantity=1&total_amount=2200&vat_amount=200&tax_free_amount=0&approval_url=https://developers.kakao.com/success&fail_url=https://developers.kakao.com/fail&cancel_url=https://developers.kakao.com/cancel";
			OutputStream outputStream = serverConnect.getOutputStream();
			DataOutputStream giver = new DataOutputStream(outputStream);
			giver.writeBytes(parameter);
			giver.close();
			
			int result = serverConnect.getResponseCode();
			
			InputStream taker;
			
			if(result == 200) {
				taker = serverConnect.getInputStream();
			}else {
				taker = serverConnect.getErrorStream();
			}
			
			InputStreamReader reader = new InputStreamReader(taker);
			BufferedReader casting = new BufferedReader(reader);
			return casting.readLine();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return "{\"result\":\"no\"}";
	}
	
}
