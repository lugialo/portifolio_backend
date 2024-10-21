# Exercício 10: Modelagem REST

# Serviço Escolhido:

* Aplicativo de música

### Casos de uso:

- Acessar informações de uma música

- Manipular informações de uma música

- Acessar informações de uma playlist

- Manipular informações de uma playlist


### Recursos

- musicas
- playlists

### Endpoints

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar uma música | `GET /musicas/{musica-id}` | `GET` | Vazio | `200 OK` | `404 Not Found` - A música não foi encontrada. | 
