FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI +=  "file://config.cfg \
            file://0001-Workaround-rauc_hawkbit-compilation-issues-on-UBUNTU.patch"

do_patch_append() {
    bb.note("copying config.cfg from meta layer to source dir")
    import shutil
    src = d.getVar('WORKDIR') + "/config.cfg"
    dst = d.getVar('S') + "/rauc_hawkbit/config.cfg"
    shutil.copyfile(src, dst)
}
