window.onload = function() {

    let x = +prompt("Įveskite pirmąjį skaičių");
    let y = +prompt("Įveskite antrąjį skaičių");
    let veiksmas = prompt("Įveskite norima atlikti veiksmą (sudėtis/atimtis/daugyba/dalyba");

    // alert("Atlikus " + veiksmas + "su skaičiais " + x + " ir " + y + " rezultatas yra: " + veiksmoParinkimas(x, y, veiksmas));
    veiksmoParinkimasIsvedimas(x, y, veiksmas);

}


function veiksmoParinkimas(x, y, veiksmas){
    let rezultatas
    if (veiksmas == "sudėtis" || veiksmas == "sudetis") {
        rezultatas = x + y;
    } else if (veiksmas == "atimtis"){
        rezultatas = x - y;
    } else if(veiksmas == "daugyba") {
        rezultatas = x * y;
    } else if (veiksmas == "dalyba") {
        if (y == 0) {
            rezultatas = "dalyba iš 0 negalima";
        }
        else{
            rezultatas = x / y;
        }
    }
    else {
        rezultatas = "neteisingas veiksmas";
    }
    return rezultatas;
}

function veiksmoParinkimasIsvedimas(x, y, veiksmas) {
    if (veiksmoParinkimas(x, y, veiksmas) == x + y) {
        alert("Sudėjus " + x + " ir " + y + " rezultatas yra " + veiksmoParinkimas(x, y, veiksmas));
    } else if (veiksmoParinkimas(x, y, veiksmas) == x - y){
        alert("Atėmus " + y + " iš " + x + " rezultatas yra " + veiksmoParinkimas(x, y, veiksmas));
    } else if(veiksmoParinkimas(x, y, veiksmas) == x * y) {
        alert("Padauginus " + x + " iš " + y + " rezultatas yra " + veiksmoParinkimas(x, y, veiksmas));
    } else if (veiksmoParinkimas(x, y, veiksmas) == x / y){
        alert("Padalinus " + x + " iš " + y + " rezultatas yra " + veiksmoParinkimas(x, y, veiksmas));
    } else if (veiksmoParinkimas(x, y, veiksmas) == "dalyba iš 0 negalima") {
        alert("Dalyba iš 0 negalima");
    } 
    else {
        alert("Įvestas neteisingas veiksmas");
    }
}