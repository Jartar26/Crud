
async function AddName() {
    const name = document.getElementById("inName").value;
    const url = `/vanila/mongo/${name}/add`;
    let cases = await fetch(url)
    .then(response => response.json())
    .then(data => data);
}
