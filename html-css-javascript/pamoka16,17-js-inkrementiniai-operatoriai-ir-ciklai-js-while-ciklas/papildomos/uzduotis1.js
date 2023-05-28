window.onload = function() {

    let zodis = prompt(`Įveskite žodį`);
    let pradzia = +prompt(`Įveskite pirmos raidės skaitinę reikšmę`);
    let pabaiga = +prompt(`Įveskite paskutinės raidės skaitinę reikšmę`);
    console.log(tekstoGrazinimas(zodis, pradzia, pabaiga));
    
}

function tekstoGrazinimas(zodis, pradzia, pabaiga) {
    let grazinamasTekstas = "";
    for(let i = pradzia; i <= pabaiga; i++){
        grazinamasTekstas += "" + zodis.at(i-1);
    }
    return grazinamasTekstas;
}