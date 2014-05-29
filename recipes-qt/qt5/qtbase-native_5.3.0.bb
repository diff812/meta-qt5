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

# specific for native version
SRC_URI += " \
    file://0008-Always-build-uic.patch \
"

do_install_append() {
    # for modules which are still using syncqt and call qtPrepareTool(QMAKE_SYNCQT, syncqt)
    # e.g. qt3d, qtwayland
    ln -sf syncqt.pl ${D}${OE_QMAKE_PATH_QT_BINS}/syncqt
}

SRCREV = "4e9853139ca04858f1639e0fba6b8caf57474f29"
