# MemeCreator

A cross-platform meme creation application built with **Kotlin Multiplatform** and **Compose Multiplatform**.

MemeCreator is a multiplatform project focused on creating memes through a shared application codebase, providing a consistent UI experience across Android and iOS.

## Features

- Cross-platform application targeting Android and iOS
- Shared UI and application logic using Compose Multiplatform
- Image loading and rendering using Coil
- Material 3 UI components
- Navigation between application screens
- Dependency injection using Koin
- Asynchronous operations using Kotlin Coroutines

## Tech Stack

- **Kotlin**
- **Kotlin Multiplatform (KMP)**
- **Compose Multiplatform (CMP)**
- **Material 3** — UI components and design system
- **Koin** — dependency injection
- **Coil** — image loading
- **Kotlin Serialization** — JSON serialization
- **Coroutines** — asynchronous operations
- **Compose Navigation** — navigation between screens
- **Android & iOS** — supported platforms

## Architecture

The project separates shared application code from platform-specific implementations:

- **Shared** — common UI, application logic, and reusable components
- **Android** — Android-specific application entry point and configuration
- **iOS** — iOS application entry point and platform-specific integration

The shared module uses dependency injection to manage application dependencies and platform-specific source sets to support multiple platforms.

## Purpose

This project was created while following **Philipp Lackner's Meme Creator course** as hands-on practice with modern Kotlin Multiplatform development, Compose Multiplatform, and building cross-platform applications using a shared Kotlin codebase.
