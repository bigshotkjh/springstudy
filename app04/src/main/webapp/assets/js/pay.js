/*
    연습문제.
    최저시급 9,860원으로 계산하기
    8시간 근무는 최저시급 그대로 받고, 초과 근무는 최저시급 1.5배를 받는다.
    workTime 시간 근무했을 때 하루 일급 계산하기
*/
var hourlyWage = 9860;
var workTime = 10;

var regularPay = hourlyWage * workTime;
var extraPay = (hourlyWage <= 8) ? 0 : (workTime - 8) * hourlyWage * 0.5;

console.log(regularPay + extraPay);