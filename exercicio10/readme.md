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
| Retornar uma música | `GET /musicas/{musica-id}` | `GET` | Vazio | `200 OK` | `404 Not Found` - música não foi encontrada. | 
| Inserir uma nova música | `POST /musicas/{musica-id}` | `POST` | `{"nome": "Man in the Box", "artista": "Alice in Chains", "album": "Facelift", "duracao": "04:45", "ano": "1990", "genero":"Rock"}` | `201 Created` | `404 Not Found - música não foi encontrada.` |
| Atualizar música | `PUT /musicas/{musica-id}` | `PUT` | `{"nome": "Man in the Box (Remastered 2024)"}` | `200 OK` | `404 Not Found - música não foi encontrada.`