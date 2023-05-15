window.onload = function() {

    let z = prompt("Įveskite žodį");
    console.log(`Įvestas žodis`);
    console.log(`Žodžio ${z} ilgis yra ${z.length}`);
    console.log(`Žodžio ${z} paskutinė raidė yra ${z.at(-1)}`);
    console.log(`Žodžio ${z} paskutinė raidė yra ${z[z.length - 1]}`);
    console.log(`Žodis ${z} turi savyje žodį taip : ${z.toLocaleLowerCase().includes("taip")}`);

    let z1 = prompt("Įveskite ieškomą žodio galūnę");
    console.log(`Žodis ${z} baigiasi ${z1} : ${z.toLocaleLowerCase().endsWith(z1.toLocaleLowerCase())}`);
}

