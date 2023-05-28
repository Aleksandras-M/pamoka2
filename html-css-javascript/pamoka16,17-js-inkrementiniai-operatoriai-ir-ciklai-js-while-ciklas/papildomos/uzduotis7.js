window.onload = function() {

    let pradzia = +prompt(`Įveskite intervalo pradžią`);
    let pabaiga = +prompt(`Įveskite intervalo pabaigą`);
    
    teisingasSumosAtsakymas(pradzia, pabaiga)
    
}

function atsitiktinisSveikasSkaicius(pradzia, pabaiga) {
    return Math.round(Math.random() * (pabaiga - pradzia) + pradzia)

}

function teisingasSumosAtsakymas(x, y){

    let a = atsitiktinisSveikasSkaicius(x, y);
    let b = atsitiktinisSveikasSkaicius(x, y);
    let c = a + b
    let ivestis = +prompt(`Įveskite skaičių ${a} ir ${b} sumą`)
    
    while(c != ivestis){
        ivestis = +prompt(`%ved4te neteisingą ${a} ir ${b} sumą. Bandykite iš naujo`)
    }
    alert(`Teisingai. ${a} ir ${b} sumą yra ${a + b}`)
}