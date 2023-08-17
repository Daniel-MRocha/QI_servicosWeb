let url_do_aluno = "http://localhost:8080/alunos/2"
let aluno
async function aluno_pos(){
    let aln = await fetch(url_do_aluno)
    .then(aln => aln.json())
    .then(aln => aluno = aln)
}

aluno = aluno_pos()