/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-19 05:52:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservationFinal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/workspace/5_Server/semiproject/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1688986851185L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>예약 확인창</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/header.css\"> <!-- 헤더 스타일 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/reservationFinal.css\"> <!-- 예약확인창 스타일 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/footer.css\"><!-- 풋터 스타일 -->\r\n");
      out.write("    <!-- j쿼리 url -->\r\n");
      out.write("    <script src=\"resources/js/jquery-3.7.0.min.js\"></script>\r\n");
      out.write("    <!-- 폰트 url -->\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/7bc7245179.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- 부트스트랩 -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!----------------------------------------헤더 --------------------------------------------->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("    <!----------------------------------------헤더 --------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("    <!----------------------------------------바디 --------------------------------------------->\r\n");
      out.write("    <form action=\"book/bookEnd\" method=\"get\">\r\n");
      out.write("        <div class=\"C-body\">\r\n");
      out.write("            <div class=\"C-Final-rsv\">\r\n");
      out.write("                <div class=\"C-body-first-div\">예약하기</div>\r\n");
      out.write("                <div class=\"C-body-rsvInfo\">\r\n");
      out.write("                    <div class=\"C-rsvInfo\">\r\n");
      out.write("                        <table class=\"C-rsvInfo-table\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td><strong>예약자 정보</strong></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td>이름</td>\r\n");
      out.write("                                <td><input type=\"text\" id=\"C-rsvName\" name=\"C-rsvName\" autocomplete=\"off\" readonly></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td>이메일</td>\r\n");
      out.write("                                <td><input type=\"text\" id=\"C-rsvEmail\" name=\"C-revEmail\" autocomplete=\"off\" readonly></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td>전화번호</td>\r\n");
      out.write("                                <td><input type=\"text\" id=\"C-rsvTel\" name=\"C-rsvTel\" autocomplete=\"off\" readonly></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td>주소</td>\r\n");
      out.write("                                <td><input type=\"text\" id=\"C-rsvAddress\" name=\"C-rsvAddress\" autocomplete=\"off\" readonly></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td>호텔 이용안내</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td colspan=\"2\">\r\n");
      out.write("                                    <textarea name=\"C-rsvOrder\" id=\"C-rsvOrder\" cols=\"65\" rows=\"3\" autocomplete=\"off\" disabled>\r\n");
      out.write("① 요금에는 10% 부가가치세가 부과됩니다.\r\n");
      out.write("\r\n");
      out.write("② 2인 1실 기준 객실 이용 시 1박당 5,000원의 주차 요금이 부과됩니다.\r\n");
      out.write("\r\n");
      out.write("③ 유료 주차는 객실당 1대에 한하며, 추가 차량은 이용이 어려운 점 양해 부탁드립니다.\r\n");
      out.write("\r\n");
      out.write("④ 체크인 시 등록카드 작성 및 투숙객 본인 확인을 위해 본인 사진이 포함된 신분증을 반드시 제시해 주시기 바랍니다.\r\n");
      out.write("\r\n");
      out.write("⑤ 13세 이하 어린이는 객실 인원 추가 요금을 받지 않습니다.\r\n");
      out.write("\r\n");
      out.write("⑥ 37개월 미만 유아는 조식이 무료입니다.\r\n");
      out.write("\r\n");
      out.write("⑦ 안내견을 제외한 애완견 등 동물 입장은 불가합니다.\r\n");
      out.write("\r\n");
      out.write("⑧ 부모를 동반하지 않은 만 19세 미만 미성년자는 투숙할 수 없습니다. (청소년 보호법 30조/58조)\r\n");
      out.write("\r\n");
      out.write("⑨ 상기 요금은 할인 요금이며, 중복 할인은 적용되지 않습니다.\r\n");
      out.write("\r\n");
      out.write("⑩ 객실 이용 시 1박당 5,000원의 주차 요금이 부과됩니다. (객실당 1대에 한하며, 추가 차량 이용 불가)\r\n");
      out.write("자세한 객실안내는 02-2231-0707로 문의 바랍니다.\r\n");
      out.write("                                    </textarea>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"C-moneyAll\">\r\n");
      out.write("                        <div class=\"C-moneyInfo\">\r\n");
      out.write("                            <table class=\"C-moneyInfo-table\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><strong>결제정보</strong></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>결제수단</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <select name=\"C-payplan\" id=\"C-payplan\">\r\n");
      out.write("                                            <option value=\"none\" selected>결제수단선택</option>\r\n");
      out.write("                                            <option id=\"C-bank\" value=\"무통장입금\">무통장입금</option>\r\n");
      out.write("                                            <option value=\"none\">선불/체크카드</option>\r\n");
      out.write("                                            <option value=\"none\">신용카드</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr id=\"C-display-change\">\r\n");
      out.write("                                    <td>입금계좌</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <select name=\"C-account\" id=\"C-account\">\r\n");
      out.write("                                            <option value=\"none\" selected>은행 / 계좌 선택</option>\r\n");
      out.write("                                            <option id=\"C-tossBank\" value=\"토스뱅크\">토스뱅크 1000-2161-7612</option>\r\n");
      out.write("                                            <option value=\"C-kakaoBack\">카카오뱅크 3333-05-265481</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr id=\"C-display-change2\">\r\n");
      out.write("                                    <td>입금자명</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <input type=\"text\" id=\"C-accountName\" name=\"C-accountName\" value=\"K-호텔\" autocomplete=\"off\" readonly>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"C-payInfo\">\r\n");
      out.write("                            <table class=\"C-payInfo-table\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><strong>요금안내</strong></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>객실요금</td>\r\n");
      out.write("                                    <td><input type=\"text\" id=\"C-hotelPay\" name=\"C-hotelPay\" autocomplete=\"off\" readonly></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>쿠폰선택</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <select name=\"C-rsv-coupon\" id=\"C-rsv-coupon\">\r\n");
      out.write("                                            <option value=\"none\" selected>쿠폰선택</option>\r\n");
      out.write("                                            <option name=\"discountCoupon\" value=\"discountcoupon\">3만원 할인 쿠폰</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>할인요금</td>\r\n");
      out.write("                                    <td><input type=\"text\" name=\"C-couponPay\" id=\"C-couponPay\" autocomplete=\"off\" readonly>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td class=\"Iwantgohome\">결제금액</td>\r\n");
      out.write("                                    <td><input type=\"text\" name=\"C-finalpay\" id=\"C-finalpay\" autocomplete=\"off\" readonly></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"C-rsv-agree\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <strong>이용약관 동의</strong>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <textarea name=\"C-rsvOrder\" id=\"C-rsvagree\" cols=\"90\" rows=\"3\" disabled>\r\n");
      out.write("K-호텔 객실예약과 관련하여 귀사가 아래와 같이 본인의 개인정보를 수집 및 이용하는데 동의합니다.\r\n");
      out.write("\r\n");
      out.write("<개인정보의 수집 · 이용에 관한 사항>\r\n");
      out.write("① 수집 이용 항목 | 카드정보(카드종류, 카드번호, 유효기간)\r\n");
      out.write("② 수집 이용 목적 | 호텔 객실 예약 시 저장하신 결제정보 활용\r\n");
      out.write("* 신용카드 정보 수집으로 직접 결제가 이루어지는 것은 아니며, 다음 호텔 객실 예약 이용 시 카드정보를 다시 입력하지 않아도 되는 편의 제공 목적입니다.\r\n");
      out.write("\r\n");
      out.write("③ 보유 이용 기간 | 예약일 후 1년\r\n");
      out.write("※ 위 사항에 대한 동의를 거부할 수 있으나, 이에 대한 동의가 없을 경우 다음 호텔 객실 및 서비스 결제 시, 다시 해당 결제 정보를 입력해야 함을 알려드립니다.</textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label for=\"C-revAgreeYes\">동의함</label>&nbsp;&nbsp;<input type=\"radio\" name=\"C-revAgree\" value=\"C-rsv-agree-yes\" id=\"C-revAgreeYes\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                        <label for=\"C-revAgreeNo\">동의하지 않음</label>&nbsp;&nbsp;<input type=\"radio\" name=\"C-revAgree\" value=\"C-rsv-agree-yes\" id=\"C-revAgreeNo\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"C-rsv-bottom-btn\">\r\n");
      out.write("                    <button type=\"button\" id=\"C-rsvBeforeBtn\"><a href=\"RoomChoice.html\">이전으로</a></button>\r\n");
      out.write("                    <button type=\"submit\" id=\"C-rsvClearBtn\">예약 완료</button>\r\n");
      out.write("                </span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <!----------------------------------------바디 --------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("    <!----------------------------------------풋터 --------------------------------------------->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    <!----------------------------------------풋터 --------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"resources/js/header.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/reservationFinal.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}