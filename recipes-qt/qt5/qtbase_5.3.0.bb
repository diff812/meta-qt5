require qt5-5.3.0.inc
require ${PN}.inc

SRC_URI = "\
    git://qt.gitorious.org/qt/${QT_MODULE}.git;branch=${QT_MODULE_BRANCH} \
"

# common with -native
SRC_URI += "\
    file://0001-Add-linux-oe-g-platform.patch \
    file://0002-Add-external-hostbindir-option.patch \
    file://0003-qlibraryinfo-allow-to-set-qt.conf-from-the-outside-u.patch \
    file://0004-configureapp-Prefix-default-LIBDIRS-and-INCDIRS-with.patch \
    file://0001-Fix-missing-plugin_types.patch \
    file://0001-Revert-eglfs-Print-the-chosen-config-in-debug-mode.patch \
"

# target specific
SRC_URI += "\
    file://0005-qmake-don-t-build-it-in-configure-but-allow-to-build.patch \
    file://0006-eglfs-fix-egl-error-for-platforms-only-supporting-on.patch \
    file://0007-qeglplatformintegration-Undefine-CursorShape-from-X..patch \
"

SRCREV = "4e9853139ca04858f1639e0fba6b8caf57474f29"
