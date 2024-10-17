
# Git

## 1. Configuración inicial de Git

Antes de comenzar a trabajar con Git, es necesario configurar tu nombre de usuario y correo electrónico para identificar tus commits:

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu_correo@example.com"
```

Puedes verificar tu configuración con:

```bash
git config --list
```

## 2. Áreas de trabajo en Git

Git maneja los archivos en diferentes áreas durante el flujo de trabajo. Estas son las áreas principales:

### a) **Directorio de Trabajo (Working Directory)**
   Es el lugar donde editas, creas y modificas archivos. Los archivos pueden estar en los siguientes estados:
   - **Untracked (no seguidos)**: Archivos nuevos no bajo control de Git.
   - **Modified (modificados)**: Archivos que han cambiado desde el último commit.
   - **Unmodified (sin cambios)**: Archivos que no han sido modificados.

### b) **Área de preparación (Staging Area)**
   Aquí es donde se colocan los cambios que deseas incluir en tu próximo commit. Para agregar un archivo modificado al área de preparación:

   ```bash
   git add archivo.txt
   ```

### c) **Repositorio Local**
   El repositorio local es donde Git guarda los commits, es decir, las instantáneas de tu proyecto. Para hacer un commit de los cambios añadidos al área de preparación:

   ```bash
   git commit -m "Mensaje del commit"
   ```

### d) **Repositorio Remoto**
   Es una copia del repositorio local alojada en un servidor remoto (por ejemplo, GitHub, GitLab). Puedes enviar tus commits al repositorio remoto con:

   ```bash
   git push origin main
   ```

   También puedes traer los últimos cambios del repositorio remoto a tu repositorio local con:

   ```bash
   git pull origin main
   ```

## 3. Flujo de trabajo en Git

1. Modificas archivos en el **directorio de trabajo**.
2. Añades los cambios al **área de preparación** con `git add`.
3. Guardas los cambios en el **repositorio local** con `git commit`.
4. Envías tus cambios al **repositorio remoto** con `git push`.

Este archivo cubre los conceptos y comandos básicos para trabajar con Git de manera eficiente.


## 4. Comandos básicos de Git

### a) Ver el estado del repositorio
   ```bash
   git status
   ```

### b) Añadir cambios al área de preparación
   - Añadir un archivo específico:
     ```bash
     git add archivo.txt
     ```
   - Añadir todos los archivos modificados:
     ```bash
     git add .
     ```

### c) Hacer un commit
   ```bash
   git commit -m "Descripción de los cambios"
   ```

### d) Ver el historial de commits
   ```bash
   git log
   ```

### e) Trabajar con ramas
   - Ver las ramas actuales:
     ```bash
     git branch
     ```

   - Crear una nueva rama:
     ```bash
     git checkout -b nueva_rama
     ```

   - Cambiar a otra rama:
     ```bash
     git checkout nombre_rama
     ```

   - Fusionar una rama con la actual:
     ```bash
     git merge nombre_rama
     git rebase nombre_rama
     git cherry-pick <commit_hash>
     ```

### f) Eliminar un commit (revertir cambios)
   Si has hecho un commit que deseas deshacer, puedes:
   
   - Deshacer el commit y mover los cambios al área de trabajo:
     ```bash
     git reset HEAD^
     git reset --soft HEAD^
     ```

   - Deshacer el commit y eliminar los cambios por completo:
     ```bash
     git reset --hard HEAD^
     ```

### g) Revertir un commit sin alterar el historial
   Para crear un nuevo commit que revierta los cambios:
   ```bash
   git revert HEAD
   ```

