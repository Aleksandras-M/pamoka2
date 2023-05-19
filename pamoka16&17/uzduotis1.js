window.onload = function() {

    let pradzia = +prompt(`Įveskite sekos pradžią`);
    let pabaiga = +prompt(`Įveskite sekos pabaigą`);
    let intervalas = +prompt(`Įveskite intervalą`)
    rastiSkaiciu(pradzia, pabaiga, intervalas)
}

function rastiSkaiciu(a, b, c) {
    for(let i = a; i <= b; i += c){
        console.log(i);
    }
}