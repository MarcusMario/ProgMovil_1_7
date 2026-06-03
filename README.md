# Laboratorio_Siete - Reproductor de Video en Android

## Descripción

Aplicación Android desarrollada en Kotlin que permite reproducir videos locales y remotos utilizando el componente `VideoView`. La aplicación muestra una lista de videos mediante un `ListView`, donde cada elemento contiene una imagen representativa y el nombre del video. Al seleccionar un elemento, el video correspondiente se reproduce en pantalla.

## Objetivo

Implementar el uso de:

* VideoView
* MediaController
* ListView
* Adaptadores personalizados
* Recursos multimedia locales (`raw`)
* Reproducción de video desde Internet
* ViewBinding
* Programación en Kotlin

## Tecnologías Utilizadas

* Android Studio
* Kotlin
* Android SDK 26+
* ViewBinding
* ConstraintLayout
* VideoView
* MediaController

## Estructura del Proyecto

```text
Laboratorio_Siete
│
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── mx
│   │   │   │       └── unam
│   │   │   │           ├── MainActivity.kt
│   │   │   │           └── video
│   │   │   │               ├── Modelo.kt
│   │   │   │               └── RecipeAdapter.kt
│   │   │   │
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   ├── activity_video.xml
│   │   │   │   │   └── list_item_row.xml
│   │   │   │   ├── drawable
│   │   │   │   │   ├── video_uno.png
│   │   │   │   │   └── video_dos.png
│   │   │   │   ├── raw
│   │   │   │   │   └── video.3gp
│   │   │   │   └── values
│   │   │   │       ├── strings.xml
│   │   │   │       └── themes.xml
│   │   │   │
│   │   │   └── AndroidManifest.xml
│   │
│   └── build.gradle.kts
│
└── README.md
```

## Funcionalidades

### Reproducción de Video Local

<img width="451" height="988" alt="image" src="https://github.com/user-attachments/assets/4d96ef6d-ff28-4a18-8a7a-42cd7dccdc15" />


La aplicación permite reproducir un archivo almacenado en:

```text
res/raw/video.3gp
```

### Reproducción de Video Remoto

También reproduce un video alojado en Internet mediante una URL:

```text
https://archive.org/download/ElephantsDream/ed_hd.mp4
```

### Lista de Videos

Los videos disponibles se muestran mediante un `ListView` utilizando un adaptador personalizado (`RecipeAdapter`).

### Controles Multimedia

Se utiliza `MediaController` para proporcionar:

* Play
* Pause
* Avance
* Retroceso
* Barra de progreso

## Permisos

La aplicación requiere acceso a Internet para reproducir videos remotos.

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

## Dependencias

Agregar en `build.gradle.kts`:

```kotlin
implementation("androidx.appcompat:appcompat:1.7.0")
implementation("androidx.constraintlayout:constraintlayout:2.2.1")
```

Habilitar ViewBinding:

```kotlin
buildFeatures {
    viewBinding = true
}
```

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en Android Studio.
3. Sincronizar Gradle.
4. Ejecutar la aplicación en:

   * Pixel 2 API 33 o superior.
5. Seleccionar un video de la lista para reproducirlo.

## Licencia

Proyecto desarrollado con fines académicos para la asignatura de Desarrollo de Aplicaciones Móviles.
