package uk.co.mezpahlan.pods.core

val samplePodcasts = listOf(
    Podcast(
        id = 1,
        title = "Jetpack Compose Basics",
        publisher = "Android Developers",
        description = "Learn the fundamentals of building modern, reactive UIs with Jetpack Compose.",
        websiteUrl = "https://developer.android.com/jetpack/compose"
    ),
    Podcast(
        id = 2,
        title = "Kotlin Coroutines Deep Dive",
        publisher = "Kotlin Foundation",
        description = "Understand asynchronous programming, dispatchers, and structured concurrency.",
        websiteUrl = "https://kotlinlang.org/docs/coroutines-overview.html"
    ),
    Podcast(
        id = 3,
        title = "Architecture Components Unplugged",
        publisher = "Google",
        description = "Best practices for ViewModels, lifecycles, and robust application structure.",
        websiteUrl = "https://developer.android.com/topic/architecture"
    ),
    Podcast(
        id = 4,
        title = "The Bytecode Breakdown",
        publisher = "JVM Engineers",
        description = "Exploring low-level runtime behavior, garbage collection, and performance tuning.",
        websiteUrl = "https://openjdk.org/"
    ),
    Podcast(
        id = 5,
        title = "Clean Code Chronicles",
        publisher = "Software Craftsmanship Society",
        description = "Discussions on maintainable code, API contracts, and engineering standards.",
        websiteUrl = "https://github.com/clean-code-ftw"
    ),
    Podcast(
        id = 6,
        title = "Gradle Build Speed Secrets",
        publisher = "Build Performance Team",
        description = "Tips and tricks for optimizing build cache, configuration times, and CI runners.",
        websiteUrl = "https://gradle.com/"
    ),
    Podcast(
        id = 7,
        title = "Functional Kotlin",
        publisher = "Functional Programming Weekly",
        description = "Leveraging immutability, type safety, and higher-order functions effectively.",
        websiteUrl = "https://kotlinlang.org/"
    ),
    Podcast(
        id = 8,
        title = "UI Thread Chronicles",
        publisher = "Main Looper Podcast",
        description = "Avoiding jank, optimizing frame rates, and mastering Choreographer.",
        websiteUrl = "https://developer.android.com/topic/performance/vitals/render"
    ),
    Podcast(
        id = 9,
        title = "Memory Leak Mysteries",
        publisher = "Android Debuggers",
        description = "Using LeakCanary and Memory Profiler to track down stubborn references.",
        websiteUrl = "https://square.github.io/leakcanary/"
    ),
    Podcast(
        id = 10,
        title = "Open Source Governance",
        publisher = "Community Maintainers",
        description = "Managing contributions, licensing, and long-term project sustainability.",
        websiteUrl = "https://opensource.guide/"
    ),
    Podcast(
        id = 11,
        title = "Retrofit and Networking",
        publisher = "Square Open Source",
        description = "Building type-safe HTTP clients with OkHttp and Moshi serialization.",
        websiteUrl = "https://square.github.io/retrofit/"
    ),
    Podcast(
        id = 12,
        title = "Room Database Design",
        publisher = "Local Storage Guild",
        description = "Writing efficient SQLite queries, migrations, and reactive flows with Room.",
        websiteUrl = "https://developer.android.com/training/data-storage/room"
    ),
    Podcast(
        id = 13,
        title = "Material Design 3 Mastery",
        publisher = "Design Systems Weekly",
        description = "Implementing dynamic color, typography scales, and adaptive layouts.",
        websiteUrl = "https://m3.material.io/"
    ),
    Podcast(
        id = 14,
        title = "Accessibility in Mobile Apps",
        publisher = "Inclusive Tech",
        description = "Ensuring talkback support, touch targets, and contrast ratios meet standards.",
        websiteUrl = "https://developer.android.com/guide/topics/ui/accessibility"
    ),
    Podcast(
        id = 15,
        title = "Unit Testing with MockK",
        publisher = "Quality Assurance Hub",
        description = "Writing expressive and robust unit tests for Kotlin applications.",
        websiteUrl = "https://mockk.io/"
    ),
    Podcast(
        id = 16,
        title = "UI Testing with Espresso",
        publisher = "Automation Engineers",
        description = "Creating reliable instrumented UI tests and idling resource management.",
        websiteUrl = "https://developer.android.com/training/testing/espresso"
    ),
    Podcast(
        id = 17,
        title = "CI/CD Pipelines for Android",
        publisher = "DevOps Daily",
        description = "Automating builds, signing keys, and distribution via GitHub Actions.",
        websiteUrl = "https://github.com/features/actions"
    ),
    Podcast(
        id = 18,
        title = "Dependency Injection with Hilt",
        publisher = "Dagger Fanatics",
        description = "Simplifying dependency injection across Android components and ViewModels.",
        websiteUrl = "https://developer.android.com/training/dependency-injection/hilt-android"
    ),
    Podcast(
        id = 19,
        title = "Kotlin Multiplatform Mobile",
        publisher = "Cross Platform Syndicate",
        description = "Sharing business logic across Android, iOS, and backend services.",
        websiteUrl = "https://www.jetbrains.com/kotlin-multiplatform/"
    ),
    Podcast(
        id = 20,
        title = "Advanced State Management",
        publisher = "Compose Experts",
        description = "Managing complex UI states, saving restoration state, and unidirectional flows.",
        websiteUrl = "https://developer.android.com/jetpack/compose/state"
    ),
    Podcast(
        id = 21,
        title = "Navigation Graph Architectures",
        publisher = "App Navigators",
        description = "Type-safe navigation and deep linking strategies in Compose applications.",
        websiteUrl = "https://developer.android.com/guide/navigation"
    ),
    Podcast(
        id = 22,
        title = "Security Best Practices",
        publisher = "App Sec Weekly",
        description = "EncryptedSharedPreferences, certificate pinning, and ProGuard rules.",
        websiteUrl = "https://developer.android.com/topic/security/best-practices"
    ),
    Podcast(
        id = 23,
        title = "Performance Profiling in Android Studio",
        publisher = "Profiler Pro",
        description = "Analyzing CPU traces, network usage, and energy consumption profiles.",
        websiteUrl = "https://developer.android.com/studio/profiler"
    ),
    Podcast(
        id = 24,
        title = "Custom Layouts in Compose",
        publisher = "Canvas Artists",
        description = "Writing custom measurers, modifiers, and drawing directly on the canvas.",
        websiteUrl = "https://developer.android.com/jetpack/compose/custom-modifiers"
    ),
    Podcast(
        id = 25,
        title = "Animation and Motion in UI",
        publisher = "Dynamic Motion",
        description = "Implementing animate*AsState, transitions, and shared element animations.",
        websiteUrl = "https://developer.android.com/jetpack/compose/animation"
    ),
    Podcast(
        id = 26,
        title = "Legacy Code Refactoring",
        publisher = "Code Archaeologists",
        description = "Strangler fig patterns and safely migrating XML views to Compose.",
        websiteUrl = "https://refactoring.com/"
    ),
    Podcast(
        id = 27,
        title = "API Design Principles",
        publisher = "Interface Guild",
        description = "Designing intuitive libraries and SDKs with strong backward compatibility.",
        websiteUrl = "https://semver.org/"
    ),
    Podcast(
        id = 28,
        title = "Reactive Streams with Flow",
        publisher = "Async Wizards",
        description = "Cold and hot flows, sharing operators, and state management in repositories.",
        websiteUrl = "https://kotlinlang.org/docs/flow.html"
    ),
    Podcast(
        id = 29,
        title = "Concurrency Patterns",
        publisher = "Thread Safety Weekly",
        description = "Mutex, semaphores, and structured concurrency guarantees in production.",
        websiteUrl = "https://kotlinlang.org/docs/coroutines-basics.html"
    ),
    Podcast(
        id = 30,
        title = "Enterprise Mobile Engineering",
        publisher = "Staff Engineer Podcast",
        description = "Scaling large engineering organizations, feature flagging, and experimentation.",
        websiteUrl = "https://staffeng.com/"
    ),
    Podcast(
        id = 31,
        title = "Linux Kernel Tuning",
        publisher = "System Administrators",
        description = "Managing kernel parameters, cgroups, and power management profiles.",
        websiteUrl = "https://www.kernel.org/"
    ),
    Podcast(
        id = 32,
        title = "Docker and Podman Workflows",
        publisher = "Container Dispatch",
        description = "Rootless containers, volume management, and multi-stage builds.",
        websiteUrl = "https://podman.io/"
    ),
    Podcast(
        id = 33,
        title = "Git Advanced Workflows",
        publisher = "Version Control Experts",
        description = "Rebasing, interactive staging, reflog recovery, and hooks automation.",
        websiteUrl = "https://git-scm.com/"
    ),
    Podcast(
        id = 34,
        title = "Static Site Generation",
        publisher = "Hugo Enthusiasts",
        description = "Building fast static sites with Go templates and Markdown pipelines.",
        websiteUrl = "https://gohugo.io/"
    ),
    Podcast(
        id = 35,
        title = "Coffee Roasting Science",
        publisher = "Espresso Lab",
        description = "Extraction pressures, grind distribution, and bean processing methods.",
        websiteUrl = "https://www.home-barista.com/"
    ),
    Podcast(
        id = 36,
        title = "Single Malt Whisky Tasting",
        publisher = "Scotch Journal",
        description = "Exploring unpeated regional profiles, cask finishes, and aging notes.",
        websiteUrl = "https://www.scotch-whisky.org.uk/"
    ),
    Podcast(
        id = 37,
        title = "Strength Training Mechanics",
        publisher = "Powerlifting Physics",
        description = "Leverage management, bar paths, and recovery optimization for heavy lifts.",
        websiteUrl = "https://www.strongerbyscience.com/"
    ),
    Podcast(
        id = 38,
        title = "Electric Guitar Tone Lab",
        publisher = "Tube Amplifiers Weekly",
        description = "Circuit topologies, vacuum tube biasing, and speaker cabinet responses.",
        websiteUrl = "https://www.seymourduncan.com/blog"
    ),
    Podcast(
        id = 39,
        title = "Analog Film Photography",
        publisher = "35mm Rangefinder Club",
        description = "Mechanical rangefinders, manual developing, and optical scanning.",
        websiteUrl = "https://www.leica-camera.com/"
    ),
    Podcast(
        id = 40,
        title = "Classic Point and Click Adventures",
        publisher = "Retro Gaming Guild",
        description = "Designing narrative puzzles and engine implementations like ScummVM.",
        websiteUrl = "https://www.scummvm.org/"
    ),
    Podcast(
        id = 41,
        title = "Science Fiction Book Club",
        publisher = "Speculative Fiction Hub",
        description = "Deep dives into worldbuilding, hard science fiction, and classic literature.",
        websiteUrl = "https://www.isfdb.org/"
    ),
    Podcast(
        id = 42,
        title = "Philosophy of Technology",
        publisher = "Digital Ethics",
        description = "Examining the societal impacts of automation, software, and connectivity.",
        websiteUrl = "https://plato.stanford.edu/entries/technology/"
    ),
    Podcast(
        id = 43,
        title = "Economics of Open Source",
        publisher = "Sustaining Code",
        description = "Funding models, developer sustainability, and corporate sponsorship.",
        websiteUrl = "https://sustainoss.org/"
    ),
    Podcast(
        id = 44,
        title = "History of Computing",
        publisher = "Silicon Roots",
        description = "Tracing milestones from vacuum tubes to modern system-on-chips.",
        websiteUrl = "https://www.computerhistory.org/"
    ),
    Podcast(
        id = 45,
        title = "Typography and Grid Systems",
        publisher = "Visual Design Basics",
        description = "Proportions, font pairings, and legible hierarchy across screen sizes.",
        websiteUrl = "https://m3.material.io/styles/typography/overview"
    ),
    Podcast(
        id = 46,
        title = "Audio Engineering Fundamentals",
        publisher = "Sound Waves",
        description = "Signal routing, equalization principles, and acoustic treatment.",
        websiteUrl = "https://www.soundonsound.com/"
    ),
    Podcast(
        id = 47,
        title = "Travel by Rail",
        publisher = "Sleeper Train Journeys",
        description = "Cross-border routes, international timetables, and scenic night trains.",
        websiteUrl = "https://www.seat61.com/"
    ),
    Podcast(
        id = 48,
        title = "Urban Exploration",
        publisher = "City Walkers",
        description = "Discovering historical architecture, industrial heritage, and city footpaths.",
        websiteUrl = "https://www.openstreetmap.org/"
    ),
    Podcast(
        id = 49,
        title = "Culinary Chemistry",
        publisher = "Kitchen Science",
        description = "Thermal reactions, emulsification physics, and cast iron seasoning.",
        websiteUrl = "https://www.seriouseats.com/"
    ),
    Podcast(
        id = 50,
        title = "The Final Commit",
        publisher = "End of Day Debrief",
        description = "Winding down with relaxed discussions on software engineering and hobbies.",
        websiteUrl = "https://github.com/"
    )
)