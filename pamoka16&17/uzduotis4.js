window.onload = function() {

    let pradzia = +prompt(`įveskite intervalo pradžią`);
    let pabaiga = +prompt(`įveskite intervalo pabaigą`);
    console.log(intervaloSkaiciuSandauga(pradzia, pabaiga));

}

function intervaloSkaiciuSandauga(pradzia, pabaiga) {
    let sandauga = 1
    for(let i = pradzia; i <= pabaiga; i++) {
        sandauga *= i
    }
    return sandauga;
}