/*
 * package kHotel.member.controller;
 * 
 * import java.io.ByteArrayInputStream; import java.io.IOException; import
 * java.io.ObjectInputStream;
 * 
 * import javax.servlet.ServletContext; import
 * javax.servlet.ServletContextEvent; import
 * javax.servlet.ServletContextListener; import
 * javax.servlet.annotation.WebListener; import javax.servlet.http.Cookie;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpSession;
 * 
 * import kHotel.member.model.vo.Member;
 * 
 * @WebListener public class AutoLogin implements ServletContextListener {
 * 
 * @Override public void contextInitialized(ServletContextEvent event) {
 * ServletContext servletContext = event.getServletContext();
 * checkAutoLogin(servletContext); }
 * 
 * private void checkAutoLogin(ServletContext servletContext) {
 * HttpServletRequest request = (HttpServletRequest)
 * servletContext.getAttribute("request"); Cookie[] cookies =
 * request.getCookies(); if (cookies != null) { for (Cookie cookie : cookies) {
 * if (cookie.getName().equals("myObjectCookie")) { // 쿠키에서 로그인 정보를 읽어와 자동 로그인
 * 처리를 수행합니다. doAutoLogin(cookie.getValue(), request); break; } } } }
 * 
 * private void doAutoLogin(String encodedObject, HttpServletRequest request) {
 * // 쿠키에서 읽어온 로그인 정보를 역직렬화하여 자동 로그인 처리를 수행하는 로직을 작성합니다. byte[] objectBytes =
 * java.util.Base64.getDecoder().decode(encodedObject);
 * 
 * // 역직렬화하여 객체로 변환 try (ByteArrayInputStream bis = new
 * ByteArrayInputStream(objectBytes); ObjectInputStream ois = new
 * ObjectInputStream(bis)) { Member loginMember = (Member) ois.readObject(); //
 * 객체 사용 if (loginMember != null) {
 * 
 * performLogin(loginMember, request); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * private void performLogin(Member loginMember, HttpServletRequest request) {
 * HttpSession session = request.getSession(true);
 * session.setAttribute("loggedInMember", loginMember); } }
 */