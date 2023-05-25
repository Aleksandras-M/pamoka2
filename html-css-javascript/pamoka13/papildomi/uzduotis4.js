window.onload = function() {

    let x = +prompt("Įveskite savaitės dienos skaičių")

    alert(dienosPavadinimas(x));
}

function dienosPavadinimas(x){
    let diena;

    switch (x) {
        case 1: 
            diena = "Pirmadienis";
            break;
        case 2: 
            diena = "Antradienis";
            break;
        case 3: 
            diena = "Trečiadienis";
            break;
        case 4: 
            diena = "Ketvirtadienis";
            break;
        case 5: 
            diena = "Penktadienis";
            break;
        case 6: 
            diena = "Šeštadienis";
            break;
        case 7: 
            diena = "Sekmadienis";
            break;
        default: 
            diena = "Įvedėte neteisingą savaitės dienos skaičių";
    }
    return diena;
}