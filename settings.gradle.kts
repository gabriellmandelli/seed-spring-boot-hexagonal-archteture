rootProject.name = "hexagonal"

include("domain")
include("infrastructure:postgres-persistence")
include("infrastructure:memory-persistence")
include("application")
include("bootloader")