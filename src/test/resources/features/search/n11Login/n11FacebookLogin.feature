Feature: n11 login with Facebooklogin
#https://www.n11.com/giris-yap
@n11FacebookLogin
Scenario: n11 Facebook Login
#Feature: Ramazan login the n11 with Facebook
Given customer open the login page
  * customer Click Login Facebook Button
  * Handle Facebook Window
  Then customer Validate successfully login to Facebook

