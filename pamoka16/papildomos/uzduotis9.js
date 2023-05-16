window.onload = function() {

    let z = prompt(`Įveskite tekstą`)
    // console.log(atvirkstinisTekstas(z));
    console.log(`${z} yra palindromas: ${z == atvirkstinisTekstas(z)}`)
}

function atvirkstinisTekstas(z) {
    let atvirksciasZ = "";
    for(i = z.length - 1; i >= 0; i--){
        atvirksciasZ += z.at(i);
    }
    return atvirksciasZ;
}