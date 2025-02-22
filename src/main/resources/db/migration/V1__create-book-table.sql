CREATE TABLE books (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,                   -- Identificador único do livro
    title VARCHAR(255) NOT NULL,             -- Título do livro
    author VARCHAR(255) NOT NULL,            -- Autor do livro
    publisher VARCHAR(255),                  -- Editora
    edition VARCHAR(50),                     -- Edição do livro
    publication_year SMALLINT UNSIGNED,      -- Ano de publicação
    language VARCHAR(50),                    -- Idioma do livro
    synopsis TEXT,                           -- Sinopse ou descrição
    page_count SMALLINT UNSIGNED,            -- Número de páginas
    dimensions VARCHAR(50),                  -- Dimensões físicas (altura, largura, espessura)
    weight DECIMAL(5, 2),                    -- Peso do livro
    genre VARCHAR(100),                      -- Gênero literário
    category VARCHAR(100),                   -- Categoria temática
    tags JSON,                               -- Tags (armazenadas como JSON)
    isbn VARCHAR(20),                        -- Número ISBN
    release_date DATE,                       -- Data de lançamento
    series VARCHAR(255),                     -- Série (se o livro faz parte de uma)
    illustrator VARCHAR(255),                -- Ilustrador
    translator VARCHAR(255),                 -- Tradutor
    cover_image VARCHAR(255),                -- URL da imagem da capa
    additional_images JSON                   -- URLs de imagens adicionais (armazenadas como JSON)
);