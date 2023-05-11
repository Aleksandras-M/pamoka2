window.onload = function () {

    let x = +prompt("Įveskite pažymio balą")
    alert(x + " balo pažymio raidė yra " + pazymiokeitimasIRaideSwitch(x));

    alert(x + " balo pažymio raidė yra " + pazymiokeitimasIRaideIfElse(x));

}

function pazymiokeitimasIRaideSwitch(x) {
    let pazymis
    switch (true) {
        case x > 90 && x <= 100:
            pazymis = "A+"
            break;
        case x > 80 && x <= 90:
            pazymis = "A"
            break;
        case x > 70 && x <= 80:
            pazymis = "B"
            break;
        case x > 60 && x <= 70:
            pazymis = "C"
            break;
        case x > 50 && x <= 60:
            pazymis = "D"
            break;
        case x > 40 && x <= 50:
            pazymis = "E"
            break;
        case x >= 0 && x <= 40:
            pazymis = "Neišlaikyta"
        break;
        default:
            pazymis = "Įvedėte neteisingą pažymį"
    }

    return pazymis;
}

function pazymiokeitimasIRaideIfElse(x){
    let pazymis
    if (90 < x && x <= 100) {
        pazymis = "A+";
    } else if (80 < x && x <= 90) {
        pazymis = "A";
    } else if (70 < x && x <= 80) {
        pazymis = "B";
    } else if (60 < x && x <= 70) {
        pazymis = "C";
    } else if (50 < x && x <= 60) {
        pazymis = "D";
    } else if (40 < x && x <= 50) {
        pazymis = "E";
    } else if (0 <= x && x <= 40) {
        pazymis = "Neišlaikyta";
    } else {
        pazymis = "Įvedėte neteisingą pažymį";
    }
    return pazymis
} 