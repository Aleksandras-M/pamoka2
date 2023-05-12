window.onload = function() {

    let z = prompt("Įveskite žodį");
    let z1 = prompt("Įveskite ieškomą žodio galūnę");
    console.log(`Žodis ${z} baigiasi ${z1} : ${z.toLocaleLowerCase().endsWith(z1.toLocaleLowerCase())}`);
    
}

