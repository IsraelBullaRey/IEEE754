#Cómo ejecutar el proyecto

1. En GitHub, navegue hasta la página principal del repositorio.
2. Encima de la lista de archivos, haz clic en  Código.
![](https://docs.github.com/assets/cb-13128/mw-1440/images/help/repository/code-button.webp)
3. Copia la dirección URL del repositorio,  en "HTTPS", haz clic en:
![](https://docs.github.com/assets/cb-60499/mw-1440/images/help/repository/https-url-clone-cli.webp)
4. Abra su explorador de archivos e ingrese a la carpeta o lugar donde desee clonar el proyeto.
5. Abra **Git Bash**.
6. Escriba `git clone ` y pegue la dirección copiada en el paso **3.**
`git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY`
7. Presione **enter** y espere que git realice el proceso.
8. Abra **Apache NetBeans IDE** y en la barra de herramientas de la parte superior izquierda seleccione **File**.
9. Seleccione la opción **Open Project** y busque la carpeta o ubicación donde clonó el repositorio y seleccione **Open Project** en la parte inferior derecha.
10. Con el proyecto abierto, para poder ejecutarlo es necesario ir a `Properties -> Run -> VM Options` y entre las comillas dobles `""` pegar la ruta de la ubicación del proyecto (misma dirección donde se clonó).
