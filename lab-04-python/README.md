<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Informe de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Programación Web 2</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Python</td></tr>
<tr>
<td>NÚMERO DE LABORATORIO:</td><td>04</td><td>AÑO LECTIVO:</td><td>2023 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>18-Mayo-2023</td><td>FECHA FIN:</td><td>24-Mayo-2023</td><td>DURACIÓN:</td> <td>07 Dias </td>
</tr>
<tr><td colspan="6">RECURSOS:
    <ul>
        <li><a href="https://www.w3schools.com/js">https://www.w3schools.com/js</a></li>
        <li><a href="www.w3schools.com/nodejs/nodejs_intro.asp">www.w3schools.com/nodejs/nodejs_intro.asp</a></li>
        <li><a href="https://nodejs.org/en/docs/guides/getting-started-guide/">https://nodejs.org/en/docs/guides/getting-started-guide/</a></li> 
        <li><a href="https://nodejs.dev/learn">https://nodejs.dev/learn</li>
        <li><a href="https://www.w3schools.com/js/js_api_fetch.asp">https://www.w3schools.com/js/js_api_fetch.asp</li>
        <li><a href="https://expressjs.com/es/">https://expressjs.com/es/</li>
        <li><a href="https://developer.mozilla.org/es/docs/Web/API/Fetch_API/Using_Fetch">https://developer.mozilla.org/es/docs/Web/API/Fetch_API/Using_Fetch</li>
        <li><a href="https://developer.mozilla.org/es/docs/Learn/Server-side/Express_Nodejs/Introduction">https://developer.mozilla.org/es/docs/Learn/Server-side/Express_Nodejs/Introduction</li>
    </ul>
</td>
</<tr>
<tr><td colspan="6">DOCENTE:
<ul>
<li>Carlo Jose Luis Corrales Delgado - ccorrales@unsa.edu.pe</li>
</ul>
</td>
</<tr>
<tr><td colspan="6">INTEGRANTES:
<ul>
<li>Vladimir Arturo Sulla Quispe - vsullaq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
<tr><td colspan="6">GITHUB:
<ul>
<li>https://github.com/Vladimir2003-debug/programacion-web-2-labs/tree/main/lab-04-python
</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

## Ejecución de los ejercicios (Python Virtual Environment)

Para garantizar que todos los ejercicios se ejecuten con las mismas dependencias y versiones de Python, este laboratorio utiliza un **entorno virtual (virtualenv)** llamado `env`.

### 1. Crear el entorno virtual

Nos ubicamos en la carpeta del laboratorio:

```bash
python -m venv env
```

Para activar el entorno virtual:

#### Windows

```bash
env\Scripts\activate
```

#### Linux 

```bash
source env/bin/activate
```

Una vez activado se instala las librerias:

```
pip install -r requirements.txt
```

### Ejecucion de los ejercicios

Para ejecutar los ejercicios escribimos python seguido del archivo que queremos ejecutar

```
python ejercicio1.py
```

### Salir del entorno

Para salir del entorno virtual escribimos en la terminal:

```
deactivate
```
